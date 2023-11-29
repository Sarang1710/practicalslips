import { useEffect, useState } from "react"

const LifeCycle = () => {
    const [value, setValue] = useState(0);
    // ComponentDidMount
    useEffect(() => {
        console.log("Component Mounted")
    })

    // ComponentDidUpdate
    useEffect(() => {
        console.log("Component Updated")
    }, [value])

    // ComponentWillUnmount
    useEffect(() => {
        return () => {
            console.log("Component Unmounted")
        }
    }, [value])

    return (
        <div>
            <h1>LifeCycle, Component will unmount when value is 2</h1>
            <h2>{value}</h2>
            <button onClick={() => setValue(value + 1)}>Update</button>
        </div>
    )
}

export default LifeCycle;