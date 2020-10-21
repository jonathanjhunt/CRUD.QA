const createForm = document.getElementById("createForm");
const todoOutput = document.getElementById("readDiv");
const updateForm = document.getElementById("updateForm");


createForm.addEventListener('submit', function (event) {
    event.preventDefault();

    const data = {

        subject: this.subject.value,
        date: this.date.value,
        task: this.task.value
    };

    fetch("http://localhost:8082/create", {
        method: "POST",
        body: JSON.stringify(data),
        headers: {
            'Content-Type': "application/json"
        }

    }).then(response => {
        return response.json();
    }).then(data => {
        renderTodo();
        this.reset();
        console.log(data);
    }).catch(error => console.log(error));


});

updateForm.addEventListener('submit', function (event) {
    event.preventDefault();
    let id = localStorage.getItem("id");
    const data = {

        subject: this.subject.value,
        date: this.date.value,
        task: this.task.value
    };

    fetch("http://localhost:8082/update?id=" + id, {
        method: "PUT",
        body: JSON.stringify(data),
        headers: {
            'Content-Type': "application/json"
        }

    }).then(response => {
        return response.json();
    }).then(data => {
        renderTodo();
        this.reset();
        console.log(data);
    }).catch(error => console.log(error));


});


function renderTodo() {
    fetch("http://localhost:8082/get")
        .then(response => response.json())
        .then(arrayOfTodos => {
            console.log("Tasks: ", arrayOfTodos);
            todoOutput.innerHTML = '';
            arrayOfTodos.forEach(function(todo) {
                console.log(todo);

                const card = document.createElement("div");
                card.className = "card";
                // card.setAttribute("class", "card");
                todoOutput.appendChild(card);
               
                const cardImage = document.createElement("img");
                cardImage.className = "card-img";
                cardImage.src = "https://i.imgur.com/9Sd4VVA.png";
                card.appendChild(cardImage);
                const cardBody = document.createElement("div");
                cardBody.className = "card-img-overlay";
                card.appendChild(cardBody);

                const subject = document.createElement("h5");
                subject.className = "card-title";
                subject.innerText = todo.subject;
                cardBody.appendChild(subject);

                const date = document.createElement("p");
                date.className = "card-text";
                date.innerText = "Date: " + todo.date;
                cardBody.appendChild(date);

                const task = document.createElement("p");
                task.className = "card-text";
                task.innerText = "Task: " + todo.task;
                cardBody.appendChild(task);

                const deleteButton = document.createElement("b");
                deleteButton.className = "card-link";
                deleteButton.innerText = "Delete";
                deleteButton.addEventListener("click", function () {
                    deleteTask(todo.id);
                })
                cardBody.appendChild(deleteButton);

                const updateButton = document.createElement("b");
                updateButton.className = "card-link";
                updateButton.innerText = "Update";
                updateButton.addEventListener("click", function () {
                    localStorage.setItem("id", todo.id)
                    showTable();
                })
                cardBody.appendChild(updateButton);
            });

        
        }).catch(error => console.error(error));
    }

renderTodo();

function deleteTask(id) {
    fetch("http://localhost:8082/remove/" + id, {
        method: "DELETE"
    }).then(response => {
        console.log(response);
        renderTodo();
    }).catch(error => console.error(error));
}

function showTable(){
    document.getElementById('updateInputs').style.display = "block";
}
function hideTable() {
    console.log("ran function hide table")
    document.getElementById('updateInputs').style.display = "none";
    
 }
 