
# Java Spring Boot JSON RPC Server side

This project not related to any company, so feel free to make this repo for your base spring boot project.

This project uses library called "jsonrpc4j" https://github.com/briandilley/jsonrpc4j

REST api client for use this rpc : https://github.com/MatthewBrandon21/jsonrpc-jpa-postgres-client
## Tech Stack

Java Spring Boot 2.7.0 + Spring Web + Lombok + jsonrpc4j

**Database:** JPA, Postgress (Users)


## Run Locally

Clone the project

```bash
  git clone https://github.com/MatthewBrandon21/jsonrpc-jpa-postgres-server.git
```

Go to the project directory

```bash
  cd jsonrpc-jpa-postgres-server
```

Open in your java IDE

Sync Maven for depencency

Set your database connection on /src/main/resources/application.properties

Run app and automatically migrate the database (http://localhost:8081/)
## Usage/Examples

POST /api

#### User Find by ID
```
{"id":"1","jsonrpc":"2.0","method":"findById","params":{"user_id":4}}
```
#### User Find All
```
{"id":"1","jsonrpc":"2.0","method":"findAll","params":{"user_id":1}}
```

Note : because rpc must have parameter to pass, so user_id only for payload to function but do nothing for it.

#### User Create
```
{
    "id": "1",
    "jsonrpc": "2.0",
    "method": "create",
    "params": {
        "user": {
            "name": "Matthew Brandon Dani",
            "username": "matthewbd",
            "email": "matthewbrandondani@gmail.com",
            "password": "brandondani",
            "isActive": 1
        }
    }
}
```

#### User Update
```
{
    "id": "1",
    "jsonrpc": "2.0",
    "method": "update",
    "params": {
        "user_id": 1,
        "user": {
            "name": "Matthew Brandon Dani Update",
            "username": "matthewbd terupdate",
            "email": "matthewbrandondani@gmail.com",
            "password": "brandondani",
            "isActive": 1
        }
    }
}
```


## Support

If need help, feel free to contact me! MatthewBrandon21

