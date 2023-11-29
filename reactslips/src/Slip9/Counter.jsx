import { useState } from "react"

const Counter = ({ countInitialState }) => {
    const [counter, setCounter] = useState(countInitialState);
    const incremetnCounter = () => {
        setCounter(counter + 1);
    }

    const decreamentCounter = () => {
        setCounter(counter - 1);
    }

    return (
        <div>
            <button onClick={incremetnCounter}>Increase</button>
            <h1>Count is {counter}</h1>
            <button onClick={decreamentCounter}>Decrease</button>
        </div>
    )
}

export default Counter;