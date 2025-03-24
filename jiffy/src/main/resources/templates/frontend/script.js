function fetchTasks() {
    fetch('http://localhost:8080/api/tasks')
        .then(response => response.json())
        .then(data => {
            const taskList = document.getElementById('taskList');
            taskList.innerHTML = '';
            data.forEach(task => {
                const li = document.createElement('li');
                li.textContent = task.title + " - " + task.status;
                taskList.appendChild(li);
            });
        })
        .catch(error => console.error('Error fetching tasks:', error));
}
