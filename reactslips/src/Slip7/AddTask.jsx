import { useState } from "react";

const AddTask = ({ addTask }) => {
    const [task, setTask] = useState("");
    const handleClick = () => {
        addTask(task);
        setTask("");
    }
    return (
        <div>
            <input type="text" placeholder="Add Task" value={task} onChange={e => setTask(e.target.value)} />
            <button onClick={handleClick}>Add</button>
        </div>
    )
}

export default AddTask;