# north-star-sharing.github.io
A social media style app for sharing photos of the night sky with coordinates.

--------

Copyright 2021 Russell Brazell, Daniel Arbach

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

--------


# Build Instructions

### 1. Clone [North Star Sharing Client App](https://github.com/north-star-sharing/north-star-sharing-client).

### 2. Import the project to your IDE.

### 3. Add the properties files to the correct directory, the default(suggested) location is "$projectDir/../../../services/north-star-sharing.properties".
#### 3.1 The build file needs to be in the following format .
```text

client_id = 746842365231-2scssvkquergtfcnv4qrc44c5a52q6le.apps.googleusercontent.com

content_format = %s/content

```
#### 3.2 To change the location where you saved your properties file update the [connection_properties](build.gradle).

### 4. Build and install the app to your preferred device or emulator. It _MUST_ be at android API 26 or higher.

### 5. Follow the [Basic User Instructions](docs/instructions.md) to start testing the app.

### 6. Enjoy!