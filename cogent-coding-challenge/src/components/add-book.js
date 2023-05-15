import {React, useState, useEffect } from "react";
import { Link } from "react-router-dom";
import './add-book.css';

export default function Add(){

    const[inputs, setInputs] = useState([]);

    const addBook=(e)=>{
        e.preventDefault();
        fetch(`http://localhost:8080/api/books/add`,{
            method: 'POST',
            body: JSON.stringify({
                // bookId: inputs.bookID,
                title: inputs.title,
                price: inputs.price
            }),
            headers: {
                'Content-Type': 'application/json; charset-UTF-8'
            }
        })
        .then(res => res.json())
        .then(json => console.log(json));
    }

    const handleChange=(e)=>{
        e.persist();
        setInputs(inputs =>({
            ...inputs,
            [e.target.name]: e.target.value
        }));
    }

    return(
        <>
            {/* <h1>THis is the Add component</h1> */}
            <form onSubmit={addBook}>
                <h3>Add Book</h3>
                <div className="form-group">
                    <label>Title: </label>
                    <input
                        type="text"
                        name="title"
                        onChange={handleChange}
                        className="form-control"
                    ></input>
                </div>
                <div className="form-group"> 
                    <label>Price: </label>
                    <input
                        type="text"
                        name="price"
                        onChange={handleChange}
                        className="form-control"
                    ></input>
                </div>
                <button type="submit" className="btn btn-primary">Submit</button>
                <Link to={'/'}>
                    <button className="btn btn-light">Home</button>
                </Link>
            </form>
        </>
    );
}