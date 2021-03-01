## Summary

At North Star Sharing we aim to bring the furthest reaches of the vast riches from outer space
within reach one picture at a time! Weather you love to capture beautiful long exposer photos of the
night sky, or the highly technical imagines produced by telescopes like The Giant Magellan Telescope
we’ve got you covered. Easily share the captivating imagines you take alongside with the Celestial
Coordinates to a community of fellow gazers! Explore other members photos and find them for yourself
with the attached coordinates and help from your phone to point you in the right direction.

## Intended users

<ol>

  <li>A person who loves taking special photos of the night sky and other celestial events</li><br>

<ul><li>As a person who loves to share the stunning pictures I take I want a platform dedicated to
sharing pictures of the sky so that I can be inspired and share more of what
I love with people that will appreciate it.</li></ul><br>

  <li>A scientist looking to share information to help further discoveries</li><br>

<ul><li>As a scientist I understand that it is a privilege to have access to the worlds most powerful 
telescopes and I want to share those rare opportunities with the rest of the star gazing community
so that I can have more people helping to unlock the mysteries of space.</li></ul><br>

  <li>A beginner star gazer looking to find beautiful stellar objects in the night sky</li><br>

<ul><li>As someone who is just getting into star gazing I want to have access to a full library of 
interesting objects with coordinates so that I can find them and see them for myself. </li></ul><br>

</ol>

## Client component

* **Functionality**

  <ul>

    <li>Sign in to an account with google authorization</li><br>
    <li>See other users pictures</li><br>
    <li>View coordinates of the focal point of the object</li><br>
    <li>Use a phone to help guid where to look for the objects</li><br>
    <li>Share pictures and celestial coordinates</li><br>

  </ul>

* **Persistent data**

<ul>

  <li>Pictures to be uploaded</li><br>
  <li>Profile data eg: name, user type...</li><br>

</ul>

* **Device/external services**

<ul>

  <li>Full range of positing sensors (accelerometer, mag. field and gps) to capture coordinates and
guide users to object- 
    (https://developer.android.com/guide/topics/sensors/sensors_position)</li><br>

  <li>Camera - 
    (https://codelabs.developers.google.com/codelabs/camerax-getting-started#1)</li><br>

  <li>Stored files: if the picture is first loaded on to the phone </li><br>
  
</ul>

## Server component

* **Functionality**

<ul>

  <li>Holding the pictures with coordinates of other users</li><br>
  <li>Sign in to an account with google authorization</li><br>

</ul>

* **Persistent data**

<ul>

  <li>Users pictures and albums with tags and coordinates</li><br>
  <li>A copy of user profiles</li><br>

</ul>

* **External services**

<ul>

  <li>Database of celestial coordinates of the most popular objects - 
    (https://github.com/astrocatalogs/OACAPI)</li><br>

</ul>

## Stretch goals/possible enhancements

<ul>

  <li>Ability to follow other users</li>
  <li>Add interface to instruct smart-telescopes where to look</li>

</ul>
