<a name="readme-top"></a>

<!-- PROJECT SHIELDS -->
<div align="center">
  <img alt="Top language" src="https://img.shields.io/github/languages/top/DrDmlg/char-freq?style=for-the-badge&color=green">
  <img alt="Last commit" src="https://img.shields.io/github/last-commit/DrDmlg/char-freq?style=for-the-badge&color=blueviolet">
  <img alt="Stars" src="https://img.shields.io/github/stars/DrDmlg/char-freq?style=for-the-badge&color=yellow">
  <img alt="Issues" src="https://img.shields.io/github/issues/DrDmlg/char-freq?style=for-the-badge&color=red">
</div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href=" ">
    <img src="logo/logo.png" alt="Logo" width="550" height="430">
  </a>
  <h1 align="center">Character Frequency Calculator</h1>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

Welcome to the Character Frequency Calculator, a robust Java-based application designed to compute the frequency of characters in a given input string. This project encompasses various components to ensure efficient character frequency analysis while maintaining code quality and resilience.
  
<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With
* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
* ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
* ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
* ![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
* ![Lombok](https://img.shields.io/badge/lombok-red.svg?style=for-the-badge&logo=lombok&logoColor=white)
* ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites
Before you begin, ensure you have the following prerequisites installed on your system:

**Java Development Kit (JDK):** The application is built with Java, so make sure you have the latest JDK installed. 

### Installation
Setting up this app is a simple process. Follow these steps to get your local copy up and running:

1. Clone the repo:
   ```sh
   git clone https://github.com/DrDmlg/char-freq.git
   ```
2. Navigate to the project folder:
   ```sh
   cd char-freq
   ```
3. Build the project:
   ```sh
   gradle build
   ```
4. Run the application:
   ```sh
   java -jar build/libs/char-freq-0.0.1.jar
   ```

6. The application is running!

**The endpoints description is available at http://localhost:8080/swagger-ui.html You can test it using Postman or cURL**

Congratulations! You've successfully installed the Character Frequency Calculator.
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

Demonstration of a request to the endpoint.

<p align="center"> <img src="logo/endpoint.png" width="1000" height="30"></p>

<p align="center"> <img src="logo/arrow.gif" width="50" height="50"></p>

<p align="center"> <img src="logo/demo.gif" width="500" height="330"></p>

## Example 1. Illustration of what happens if you enter a string ranging from 1 to 100 characters.

**Example of incoming data:**
```json
{
    "input" : "The sun shines bright, flowers bloom."
}
```

**Example of output  data:**

```json
{
    " ": 5,
    "s": 4,
    "e": 3,
    "h": 3,
    "o": 3,
    "b": 2,
    "i": 2,
    "l": 2,
    "n": 2,
    "r": 2,
    "f": 1,
    "g": 1,
    ",": 1,
    "m": 1,
    ".": 1,
    "t": 1,
    "T": 1,
    "u": 1,
    "w": 1
}
```
## Example 2. Illustration of what happens if you enter a string exceeding 100 characters.

**Example of incoming data:**
```json
{
    "input" : "Explore diverse topics, cultivate new skills, and embrace continuous learning for personal and professional development."
}
```

**Example of output  data:**

```json
{
    "violations": [
        {
            "fieldName": "input",
            "message": "The length of the input string must be at least 1 and not exceed 100 characters"
        }
    ]
}
```

## Example 3. Illustration of what happens if you enter an empty string.

**Example of incoming data:**
```json
{
    "input" : ""
}
```

**Example of output  data:**

```json
{
    "violations": [
        {
            "fieldName": "input",
            "message": "The input string cannot be empty or contain only spaces"
        }
    ]
}
```
<hr>

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

D. Dmitry - [Linkedin](https://www.linkedin.com/in/dmitry-dorokhov/) - dorokhov.did@gmail.com

Project Link: [https://github.com/DrDmlg/char-freq](https://github.com/DrDmlg/char-freq)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
