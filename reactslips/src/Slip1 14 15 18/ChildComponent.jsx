const ChildComponent = ({name}) =>{
    return (
        <div className="m-3 p-2" style={{border:"2px orange solid"}}>
            <h1>Child Component</h1>
            <h2>Hii, {name}</h2>
        </div>

    )
}

export default ChildComponent;