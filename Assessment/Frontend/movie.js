 function movie(){
    fetch("http://www.omdbapi.com/?"+document.getElementById("moviename").value+"=milana&apikey=6fc3ef75") // Call the fetch function passing the url of the API as a parameter
    .then(function() {
        // Your code for handling the data you get from the API
    })
    .catch(function() {
        // This is where you run code if the server returns any errors
    });


};

