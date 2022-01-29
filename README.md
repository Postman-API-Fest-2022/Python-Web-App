# team-34-student-management

## Sample screenshot of the application

<img width="43px" src="" />

## Postman Documentation
## Workspace Link - <a href='https://www.postman.com/universal-equinox-64003/workspace/team-34/overview'>Click here</a>

# Student Management

**Student Database** is an API developed to manipulate data of university students. It is created with SpringBoot and tested with Postman.

This is a platform agnostic API, meaning it doesn't require any specific frontend, backend or database to work. It can work with any configuration that uses the REST standard of API. The API is able to perform four operations to the database.

## API Requests

| **Request Name** | **Requests Description**          | **Type** | **Endpoint**       |
| ---------------- | --------------------------------- | -------- | ------------------ |
| Get Student      | Get information of all students   | GET      | `/getStudent`      |
| Put Student      | Update information of one student | PUT      | `/updateStudent`   |
| Post Student     | Add information of new student    | POST     | `/registerStudent` |
| Delete Student   | Delete information of one student | DELETE   | `deleteStudent`    |

### Before You Start

The further part is detailed documentation about every request that is supported by the API. Terms used in the documentation might defer from what you use in your language / tool. So here's a brief description of terminologies used in the document.

| Terminology | Description                                                                                                                                                               |
| ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Request     | When a server is called from the frontend with some endpoint and optional parameters.                                                                                     |
| Endpoint    | The point of interaction between API and other systems.                                                                                                                   |
| Payload     | Information sent along with the request. It could be anything that is useful for API as well as the backend server to process the request.                                |
| Response    | When the request is processed, information sent back to the frontend educating it about the result of the request. It consists of HTTP status code and error and/or data. |

### Meet the Creators

The API is developed as a project for API Fest organized by Postman in the span of 26th Jan 2022 and 29th Jan 2022.  
Here are the developers:

1. [Saptak Chakraborty](saptak.bugatti20@gmail.com) - [saptak.bugatti20@gmail.com]  - [ TEAM LEAD ]
2. [Shaon Dhar](shaonnw@gmail.com) - [shaonnw@gmail.com] - API Developer [ MEMBER ]
3. [Kaushal Joshi](7joshikaushal@gmail.com) - [7joshikaushal@gmail.com] - API Documentation Creator [ MEMBER ]
4. [Kaushik Lakhani](kaushik.lakhani123@gmail.com) - [kaushik.lakhani123@gmail.com] - API Documentation Creator [ MEMBER ]

### Mock Application

To demonstrate workings of this API, we created a full stack application. It is built with Angular JS in the front end, Java Springboot in the backend and MySQL as a database. It follows REST standard of APIs.  
You can see the GitHub repo of the project [here](https://github.com/Postman-API-Fest-2022/team-34-student-management).

## GET Student

```bsah
localhost:9090/getStudents
```

This request is used to get information of all the students available in the database. The response is usually an array of objects, where each object is information about an individual student.

| **Request Type** | **Endpoint**  | **Payload** | **Response**          |
| ---------------- | ------------- | ----------- | --------------------- |
| GET              | `/getStudent` | NIL         | JSON Array of objects |

#### Body

**Raw JSON**

```json
{
  "name": "Shaon Dhar",
  "fathersName": "XYZ",
  "phone": "8556975124",
  "percentage": 98,
  "grade": "A",
  "course": "MCA",
  "address": "Kolkata",
  "email": "shaonnw@gmail.com"
}
```

## POST Student

```bash
localhost:9090/registerStudent
```

This request stores information of new students in the database.

| **Request Type** | **Endpoint**       | **Payload**                   | **Response**                           |
| ---------------- | ------------------ | ----------------------------- | -------------------------------------- |
| POST             | `/registerStudent` | Information about new student | JSON Object of newly added information |

#### Payload:

This endpoint is used for adding a new entry to the database. Hence we need to provide all the information which is required to store new values in the database.

Here's the list data with its data type that you need to provide in the payload.

| **Key**    | **Data type** | **Example**               |
| ---------- | ------------- | ------------------------- |
| name       | String        | "Kaushal Joshi"           |
| fatherName | String        | "Sharad Joshi"            |
| fatherName | String        | "Sharad Joshi"            |
| phone      | String        | "8082498523"              |
| percentage | Number        | 76                        |
| grade      | String        | "A"                       |
| course     | String        | "Engineering"             |
| address    | String        | "Mumbai"                  |
| email      | String        | "7joshikaushal@gmail.com" |

#### Things to Know

ID is supposed to be created by the database itself and it is expected to be a Number data type value.  
When the request is successful, ID will be returned along with other newly added information.

#### Body

**Raw JSON**

```json
{
  "name": "Shaon Dhar",
  "fathersName": "XYZ",
  "phone": "8556975124",
  "percentage": 98,
  "grade": "A",
  "course": "MCA",
  "address": "Kolkata",
  "email": "shaonnw@gmail.com"
}
```

## PUT Student

```bash
localhost:9090/updateStudent
```

This request modifies existing information in the database. It takes student ID as a payload and forwards it to the database. After a successful updation, API sends

| **Request Type** | **Endpoint**     | **Payload**                                       | **Response**                       |
| ---------------- | ---------------- | ------------------------------------------------- | ---------------------------------- |
| POST             | `/updateStudent` | ID (Number) <br>Informationto be updated (Object) | JSON object of updated information |

#### Payload

The autogenerated ID of student along with the information that needs to be updated is expected as a payload. ID must be of a numeric data type whereas new information must be an object.

#### Body

**Raw JSON**

```json
{
  "rollNumber": 5,
  "name": "Shaon Dhar",
  "fathersName": "XYZ",
  "phone": "8556975124",
  "percentage": 100,
  "grade": "A",
  "course": "MCA",
  "address": "Kolkata",
  "email": "shaonnw@gmail.com"
}
```

## DELETE Student

```bash
localhost:9090/deleteStudent?id=5
```

This request deletes information of individual student from the database. It takes student ID as a payload and passes it to the database. When a request is successful i.e. student is deleted, we get an empty array in return.

| **Request Type** | **Endpoint**     | **Payload** | **Response** |
| ---------------- | ---------------- | ----------- | ------------ |
| DELETE           | `/deleteStudent` | ID (Number) | Empty Array  |

#### Payload

The autogenerated ID of student that needs to be deleted from the database is sent along with the request. It is expected to be of a Number data type.

#### Parameters

| Name | Data Type | Example |
| ---- | --------- | ------- |
| id   | Number    | 5       |

#### Body

**Raw JSON**

```json
{
  "name": "Shaon Dhar",
  "fathersName": "XYZ",
  "phone": "8556975124",
  "percentage": 100,
  "grade": "A",
  "course": "MCA",
  "address": "Kolkata",
  "email": "shaonnw@gmail.com"
}
```




