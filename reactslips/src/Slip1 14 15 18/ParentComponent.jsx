import ChildComponent from "./ChildComponent"

const ParentComponent = ()=>{
    return(
        <div className="m-4 p-1" style={{border:"3px blue dotted"}}>
            <h1>Parent Component</h1>
            <ChildComponent name="Siddhesh"/>
        </div>
    )
}

export default ParentComponent;