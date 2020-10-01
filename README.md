# API BOOKS

### CREATE - POST
localhost:8080/books
<br />
Inserir
```
    {
        "name": "Steve Jobs",
        "price": 200
    }
```  
    
### LIST - GET
localhost:8080/books
<br />
Retorno
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
Retorno
```
  [
    {
       "id": 1,
       "name": "Steve Jobs",
        "price": 100
    }
  ]      
```

### EDIT - GET
localhost:8080/books?id=1
<br />
Inserir 
```  
    {
        "name": "Steve Jobs",
        "price": 100
    }  
```

### DELETE - GET
localhost:8080/books?id=1

