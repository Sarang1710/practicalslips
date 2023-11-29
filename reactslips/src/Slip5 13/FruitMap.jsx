const FruitMap = () => {
    const fruits = ["apple", "banana", "cherry", "bat"];

    return (
        <div>
            <h1>Fruit Map</h1>
            {fruits.map((fruit, index) => fruit !== "bat" ? <p key={index}>{fruit}</p> : null)}
        </div>
    );
}

export default FruitMap;