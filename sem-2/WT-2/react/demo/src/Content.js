import React from 'react'

const Content = () => {
    const handelNameChnage = () =>{
        const names = ['Nikhil','xyz','abc','wasd'];
        const int = Math.floor(Math.random() * 3);
        return names[int];
    }

    return (
        <main>
            <p>{handelNameChnage()} !</p>        
        </main>
    )
}

export default Content