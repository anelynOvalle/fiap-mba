# API BOOKS

### CREATE - POST
localhost:8080/books
<br />
Insert
```
    {
        "name": "Steve Jobs",
        "price": 200
    }
```  
    
### LIST - GET
localhost:8080/books
<br />
Return
```
  [
    {
       "id": 1,
       "name": "Steve Jobs",
        "price": 100
    }
  ]      
```

### LIST BY ID - GET
localhost:8080/books/getBook?id=1
<br />
Return
```
  [
    {
       "id": 1,
       "name": "Steve Jobs",
        "price": 100
    }
  ]      
```

### EDIT - PUT
localhost:8080/books?id=1
<br />
Insert 
```  
    {
        "name": "Steve Jobs",
        "price": 100
    }  
```

### DELETE - DELETE
localhost:8080/books?id=1

