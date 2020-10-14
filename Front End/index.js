const createForm = document.getElementById("createForm");
const todoOutput = document.getElementById("readDiv");


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

                const cardBody = document.createElement("div");
                cardBody.className = "card-body";
                card.appendChild(cardBody);

                const subject = document.createElement("h5");
                subject.className = "card-title";
                subject.innerText = todo.subject;
                cardBody.appendChild(subject);

                const date = document.createElement("p");
                date.className = "card-body";
                date.innerText = "Date: " + todo.date;
                cardBody.appendChild(date);

                const task = document.createElement("p");
                task.className = "card-body";
                task.innerText = "Task: " + todo.task;
                cardBody.appendChild(task);

                const deleteButton = document.createElement("a");
                deleteButton.className = "card-link";
                deleteButton.innerText = "Delete";
                deleteButton.addEventListener("click", function () {
                    deleteTask(todo.id);
                })
                cardBody.appendChild(deleteButton);
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