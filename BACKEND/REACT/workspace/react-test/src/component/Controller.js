
function Controller ( {handleSetNum} ) {
    
    const arr = [-1, -10, -100 ,100 ,10 ,1];

    const handleOnClick = (e) => {
        handleSetNum(Number(e.target.innerText));
        // setNum(prev => prev+ Number(e.target.innerText));
    }
 

    return (
        <div>
            {/* <button onClick={handleOnClick}>-1</button>
            <button onClick={handleOnClick}>-10</button>
            <button onClick={handleOnClick}>-100</button>
            <button onClick={handleOnClick}>+100</button>
            <button onClick={handleOnClick}>+10</button>
            <button onClick={handleOnClick}>+1</button> */}
            {arr.map((num, index) => (
                <button key={index} onClick={handleOnClick}>
                    {num}
                </button>
            ))}
        </div>

    );
}

export default Controller; 
