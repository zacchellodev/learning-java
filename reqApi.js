fetch("http://localhost:3000/api/hello")
.then(resp => resp.text()).then(msg => console.log(msg));
