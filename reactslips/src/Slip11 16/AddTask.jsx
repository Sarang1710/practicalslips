import { useState } from "react";

const AddTask = ({ addTask }) => {
    const [task, setTask] = useState("");

    return (
        <div>
            <input type="text" placeholder="Add Task" onChange={e => setTask(e.target.value)} />
            <button onClick={() => addTask(task)}>Add</button>
        </div>
    )
}

export default AddTask;