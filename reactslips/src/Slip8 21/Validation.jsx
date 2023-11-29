import { useState } from "react";

const Validation = () => {
    const [formData, setFormData] = useState({});
    const username = "Admin";
    const password = "Pass123";
    const updateData = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        })
    }
    const onSubmit = (e) => {
        e.preventDefault();
        console.log("Form Submitted");
        if (formData.username === username && formData.password === password) {
            console.log("Login Successful");
            alert("Login Successful");
        } else {
            console.log("Login Failed");
            alert("Login Failed");
        }
    }
    return (
        <div>
            <h1>Validation</h1>
            <form onSubmit={onSubmit}>
                <label>Username</label>
                <input type="text" name="username" onChange={updateData} />
                <label>Password</label>
                <input type="password" name="password" onChange={updateData} />
                <button type="submit">Submit</button>
            </form>
        </div>
    )
}

export default Validation;