const Tasks = ({ tasks, removeTask }) => {

    const row = () => tasks.map((task, index) => {
        return (<tr key={index}>
            <td>{task}</td>
            <td><button onClick={() => removeTask(index)}>Remove</button></td>
        </tr>)
    })

    return (

        <div>
            <table>
                <thead>
                    <tr>
                        <th>Tasks</th>
                        <th>Remove</th>
                    </tr>
                </thead>
                <tbody>
                    {row()}
                </tbody>
            </table>
        </div>

    )
}

export default Tasks;