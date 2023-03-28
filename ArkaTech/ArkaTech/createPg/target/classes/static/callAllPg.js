call(){
const userAction = async () => {
  const response = await fetch('http://localhost:8080/home', {
    method: 'POST',
    body: myBody, // string or object
    headers: {
      'Content-Type': 'application/json'
    }
  });
  const myJson = await response.json(); //extract JSON from the http response
  // do something with myJson
  console.log(myJson);
}
}
call();