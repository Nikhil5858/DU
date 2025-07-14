export default function UserProfile({user}){
    return(
        <>
            <h1>User name: {user.name}</h1>
            <h1>User role: {user.role}</h1>
            <h1>User bio: {user.bio}</h1>
            <h1>User joindate: {user.joinDate}</h1>
            <br></br>
        </>
    )
}