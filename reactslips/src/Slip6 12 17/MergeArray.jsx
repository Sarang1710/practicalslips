const MergeArray = () => {
    let fruits1 = ["apple", "banana"];
    let fruits2 = ["cherry", "orange"];
    let fruit = fruits1.concat(fruits2);
    return (
        <div>
            <h1>Merge Array</h1>
            {fruit.map((fruit, index) => <p key={index}>{fruit}</p>)}
        </div>
    )
}

export default MergeArray;