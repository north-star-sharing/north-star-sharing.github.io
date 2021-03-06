---
title: Project Overview
description: This is the general overview of North Star Sharing
menu: Overview
order: 10
---

## Team roster

* Russell Brazell - [Github.com/rbrazell1](https://github.com/rbrazell1), [LinkedIn.com/in/russell-brazell-abq](https://www.linkedin.com/in/russell-brazell-abq/)
* Daniel Arbach - [Github.com/darbach](https://github.com/darbach), [LinkedIn.com/in/daniel-arbach](https://www.linkedin.com/in/daniel-arbach/)

## Summary and Aim
At North Star Sharing, we aim to bring the furthest reaches of the vast riches from outer space 
within reach one picture at a time! Whether you love to capture beautiful long exposure photos of
the night sky or the highly technical images produced by telescopes like The Giant Magellan 
Telescope, we’ve got you covered. Easily share the captivating images you take alongside with the 
celestial coordinates to a community of fellow gazers! Explore other members’ photos and find them
for yourself with the attached coordinates and help from your phone to point you in the right 
direction.

The topic of this app was chosen because the members of our team share a love of science, 
particularly the exploration of outer space. We felt that there was a niche opportunity with hobby
astronomy to share photos and provide a convenient method to search and categorize images by
astronomy-related topics. We feel that the most useful feature is discovering an interesting picture
that someone else has posted to the app and being able to use the app's features to locate that same
celestial body and orient one's camera, no matter how much time has elapsed or where the 
photographer is standing upon the Earth.

## Functionality 

After signing in, users will be able to take pictures of celestial objects and attach tags for easy
categorization and searching. A user's own pictures will be displayed in a social media-style feed. 
Users may search for pictures of specific celestial objects from a robust list of available tags.
Using a tag, a user may locate a celestial object using their camera, and the app will point them 
to the correct patch of the night sky. (The heavens await!)

### [Build Instructions](build.md)

### [User Instructions](instructions.md)

### [OverView](../pdf/overview.pdf) 

### [Technology Stack](../pdf/stack.pdf)

### [REST Service Endpoints](../pdf/endpoints.pdf)

## Intended users

<ol>

  <li>A person who loves taking special photos of the night sky and other celestial events</li> <br>

<ul>

<li>As a person who loves to share the stunning pictures I take, I want a platform dedicated to
sharing pictures of the sky so that I can be inspired and share more of what I love with people that
will appreciate it.</li>

</ul> <br>

  <li>A scientist looking to share information to help further discoveries</li><br>

<ul>

<li>As a scientist, I understand that it is a privilege to have access to the worlds most
powerful telescopes and I want to share those rare opportunities with the rest of the star gazing
community so that I can have more people helping to unlock the mysteries of space.</li>

</ul> <br>

  <li>A beginner star gazer looking to find beautiful stellar objects in the night sky</li> <br>

<ul> 

<li>As someone who is just getting into star gazing, I want to have access to a full library of 
interesting objects with coordinates so that I can find them and see them for myself.</li> 

</ul> <br>

</ol>

## Client component

* **Functionality** <br>

  <ul>

    <li>Sign in to an account with google authorization</li> <br>
  
    <li>View coordinates of the focal point of the object</li> <br>

  </ul>

* **Persistent data**

<ul>

  <li>Pictures to be uploaded</li> <br>

  <li>Profile data eg: name, user type...</li> <br>

</ul>

* **Device/external services**

<ul>

  * [Full range of positing sensors (accelerometer, mag. field and gps) to capture coordinates and
guide users to object](https://developer.android.com/guide/topics/sensors/sensors_position) <br>

  * [Camera](https://developer.android.com/training/camerax/take-photo) <br>

  * [Stored files: The picture is first stored on to the phone](https://developer.android.com/training/data-storage) <br>
  
</ul>

## Server component

* **Functionality**

<ul>

  <li>Holding the pictures with coordinates of other users</li> <br>

  <li>Sign in to an account with google authorization</li> <br>

</ul>

* **Persistent data**

<ul>

  <li>Users pictures and albums with tags and coordinates</li> <br>

  <li>A copy of user profiles</li> <br>

</ul>

* **External services**

<ul>

  <li>Database of celestial coordinates of the most popular objects - 
    (https://github.com/astrocatalogs/OACAPI) & (https://github.com/astronexus/HYG-Database)</li> <br>

</ul>

### Features NOT yet implemented

<ul>

  <li>(NOT yet implemented) Add a delete button on the edit dialog to remove uploaded pictures</li>

  <li>(NOT yet implemented) Use a phone to help guid where to look for the objects</li>

  <li>(NOT yet implemented) Share pictures and celestial coordinates</li>

  <li>(NOT yet implemented) See other users pictures</li>

</ul>

### Stretch goals

<ul>

  <li>Comment support for other user pictures.</li>

  <li>Bookmark favorite images</li>

  <li>Ability to follow other users</li>

  <li>Social media feed of other users' pictures.</li>

</ul>

### Possible enhancements

<ul>

  <li>Add interface to instruct smart-telescopes where to look</li>

</ul>

### Style Updates

<ul>

  <li>Add on brand colors</li>

  <li>Make font and size consistent</li>

</ul>

---

Copyright 2021 Russell Brazell, Daniel Arbach

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

> <http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

---

[NOTICE](notice.md)