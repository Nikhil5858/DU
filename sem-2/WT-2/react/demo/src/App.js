import Header from "./Header";
import { useState,useEffect } from "react";
import UserProfile from "./UserProfile";

const user1 = {
  name: "Alex Johnson",
  role: "Frontend Developer",
  bio: "Passionate about building intuitive user interfaces with React.",
  joinDate: "January 2022",
};

const user2 = {
  name: "Sam Lee",
  role: "UX Designer",
  bio: "Creating beautiful and functional user experiences.",
  joinDate: "March 2023",
};

// const string = "Hi there , I'm a web developer";
// let removeSpace = "";
// for (let i = 0; i < string.length; i++) {
//   if (string[i] === " ") removeSpace += "";
//   else removeSpace += string[i];
// }
// console.log(removeSpace);

function App() {
  const [count, setCount] = useState(0);

  const[second,setSeconds] = useState(0);

  useEffect(()=>{
    const interval = setInterval(()=>{
      setSeconds(prev=>prev+1)
    },1000)
    return ()=> clearInterval(interval);
  },[])

  return (
    <>
      <Header />
      <input type="button" onClick={() => setCount(count + 1)} value={"+"} />
      <input
        type="button"
        onClick={() => setCount(count > 0 ? count - 1 : 0)}
        value={"-"}
      />
      <p>Result : {count}</p>
      {/* <UserProfile user={user1}/> */}
      {/* <UserProfile user={user2}/> */}
    </>
  );
}

export default App;
