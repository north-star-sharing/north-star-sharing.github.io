---
title: Build Instructions
description: How to install and run North Star Sharing
menu: Build
order: 60
---

### 1. Clone [North Star Sharing Client App](https://github.com/north-star-sharing/north-star-sharing-client).

### 2. Import the project to your IDE.

### 3. Clone [Noth Star Sharing Service](https://github.com/north-star-sharing/north-star-sharing-service).

### 4. Import the project to your IDE.

#### 4.1 Build the project.

#### 4.2 Creat a configuration to run the service as normal.

#### 4.3 Run the service to creat the empty database.

#### 4.4 Stop the service.

#### 4.5 Creat a configuration to run the service preloader.

#### 4.5.1 In the configuration set the VM options to include:

```text

-Dspring.profiles.active=preload

```

#### 4.6 Run the preloader configuration of the service to populate the database.

#### 4.7 After the preloader configuration finishes rerun the normal configuration.

### 5. Add the properties files to the correct directory, the default(suggested) location is "$projectDir/../../../services/north-star-sharing.properties".

#### 5.1 The build file needs to be in the following format .
```text

client_id = 746842365231-2scssvkquergtfcnv4qrc44c5a52q6le.apps.googleusercontent.com

content_format = %s/content

base_url = http://10.0.2.2:18781/northstarsharing/

```
#### 5.2 To change the location where you saved your properties file update the [connection_properties](build.gradle).

### 6. Build and install the app to your preferred device or emulator. It _MUST_ be at android API 28 or higher.

### 7. Follow the [Basic User Instructions](docs/instructions.md) to start testing the app.

### 8. Enjoy!