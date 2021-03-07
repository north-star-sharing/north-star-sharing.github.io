package edu.cnm.deepdive.northstarsharing.model.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity
public class User {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "user_id_number")
  private long userId;

  @NonNull
  @ColumnInfo(index = true)
  private Date creationTimestamp = new Date();

  @ColumnInfo(index = true)
  private Date updateTimestamp = new Date();

  @ColumnInfo(index = true)
  private Date connectedTimestamp = new Date();

  @ColumnInfo(index = true)
  private String oAuthKey = new String();

  @ColumnInfo(index = true)
  private String userName = new String();


  public long getId() {
    return userId;
  }

  public void setId(long userId) {
    this.userId = userId;
  }

  @NonNull
  public Date getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(@NonNull Date creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public Date getUpdateTimestamp() {
    return updateTimestamp;
  }

  public void setUpdateTimestamp(Date updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }

  public Date getConnectedTimestamp() {
    return connectedTimestamp;
  }

  public void setConnectedTimestamp(Date connectedTimestamp) {
    this.connectedTimestamp = connectedTimestamp;
  }

  public String getoAuthKey() {
    return oAuthKey;
  }

  public void setoAuthKey(String oAuthKey) {
    this.oAuthKey = oAuthKey;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
