import React from 'react'
import { useState } from 'react';

const Content = () => {

    const [name,setName] = useState('Abc'); 
    const [count,setCount] = useState(0);


    const handelNameChnage = () =>{
        const names = ['Nikhil','xyz','abc','wasd'];
        // let names = String(prompt("Enter the number of names"));
        const int = Math.floor(Math.random() * 4);
        setName(names[int]);
    }
    
    const handelButtonClick = () =>{
        alert("Button Clicked");
    }

    const handelSetCount = () =>{
        setCount(count + 1)
        console.log(count);
    }

    // const handelButtonClicked2 = (name) =>{
    //     alert(name);
    // }

    // const handelButtonClicked3 = (e) =>{
    //     console.log(e.target.innerText);
        
    // }

    return (
        <main>
            <p> Hello {name}!</p>
            <button onClick={handelNameChnage}>Submit to Change Name</button><br></br>
            <button onClick={handelButtonClick} >Submit</button><br></br>
            <button onClick={handelSetCount}>Increase</button><br></br>
            {/* <button onClick={() => {handelButtonClicked2('Nikhil')}} >Submit</button><br></br> */}
            {/* <button onClick={(e) => {handelButtonClicked3(e)}} >Submit</button> */}
        </main>
    )
}

export default Content