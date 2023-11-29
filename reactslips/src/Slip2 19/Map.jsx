const MapComponent = () => {
    const weekDays = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday", "Sunday"]

    return (
        <div>
            <h1>Map</h1>
            {
                weekDays.map((day, index) => {
                    return <h3 key={index}>{day}</h3>
                })
            }
        </div>
    )
}

export default MapComponent;