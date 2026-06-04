const user = {
    name: "Sudeeksha",
    event: "Music Fest"
};

setTimeout(() => {

    fetch("https://jsonplaceholder.typicode.com/posts", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(user)
    })

    .then(response => response.json())

    .then(data => {

        console.log("Success");
        console.log(data);
    })

    .catch(error => {

        console.log("Failed");
        console.log(error);
    });

}, 2000);
