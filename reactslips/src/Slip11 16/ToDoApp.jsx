import { useState } from "react"
import AddTask from "./AddTask"
import Tasks from "./Tasks";

const ToDoApp = () => {
    const [tasks, setTasks] = useState([]);
    const addTask = (task) => {
        setTasks([...tasks, task])
    }
    const removeTask = (index) => {
        tasks.splice(index, 1);
        setTasks([...tasks])
    }
    return (
        
            <div className="container">
                <h1>ToDo App</h1>
                <AddTask addTask={addTask} />
                <Tasks tasks={tasks} removeTask={removeTask} />
            </div>
        
    )
}

export default ToDoApp;