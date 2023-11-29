import { useReducer } from "react";
import AddTask from "./AddTask"
import Tasks from "./Tasks";
import toDoReducer, { initialState } from "./reducer";
const ToDoApp = () => {
    const [tasks, dispatch] = useReducer(toDoReducer, initialState);
    const addTask = (task) => {
        dispatch({
            type: 'ADD_TASK',
            payload: task
        })
    }
    const removeTask = (index) => {
        dispatch({
            type: 'DELETE_TASK',
            payload: index
        })
    }
    // for proper woring of this code remove react.strictmode from index.js
    return (

        <div className="container">
            <h1>ToDo App</h1>
            <AddTask addTask={addTask} />
            <Tasks tasks={tasks} removeTask={removeTask} />
        </div>

    )
}

export default ToDoApp;