import { useState, useEffect } from "react";
import { Link, useParams } from "react-router-dom";
import './edit-book.css';


export default function Edit(){
    const {id} = useParams();
    const[inputs, setInputs] = useState([]);
    const[book, setBook] = useState({
        bookId:0,
        title: '',
        price: 0.00
    });

    useEffect(()=>{
        console.log("id: "+id);
        fetch(`http://localhost:8080/api/books/get?id=${id}`)
        .then(res => res.json())
        .then(
            data =>{
                setBook(data);
                console.log(data);
            }
            
        )
    },[]);

    const updateBook=(e)=>{
        e.preventDefault();
        fetch(`http://localhost:8080/api/books/update?id=${id}`,{
            method: 'PUT',
            body: JSON.stringify({
                title: inputs.title,
                price: inputs.price
            }),
            headers: {
                'Content-Type': 'application/json; charset-UTF-8',
            }
        })
        .then(res => res.json)
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
            {/* <h1>THis is the Edit component</h1> */}
            <form onSubmit={updateBook}>
                <h3>Edit Book</h3>
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