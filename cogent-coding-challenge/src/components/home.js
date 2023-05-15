import './home.css';
import {React, useState, useEffect } from "react";
import { Link } from "react-router-dom";

export default function Home(){

    const[bookList, setBookList] = useState([]);

    useEffect(() =>{
        fetch(`http://localhost:8080/api/books/all`)
        .then(res => res.json())
        .then(
            data =>{
                setBookList(data);
            }
        )
    }, [])

    const deleteBook=(id)=>{
        fetch(`http://localhost:8080/api/books/delete?id=${id}`,{
            method: 'DELETE'
        })
        .then(res => res.json)
        .then(json => console.log(json));
        // requires async function
        //window.location.reload();
    }

    // IN the <tbody> in the map function, 
    // Why are wer using parentheses and not curly braces?
    return(
        <div className='book-table-div'>
            {/* <h1>THis is the Home component</h1> */}
            <h1>Book List</h1>
            <table className="table table-striped table-bordered">
                <thead>
                    
                </thead>
                <tbody>
                    {bookList.map(book =>(
                        <tr key={book.bookId}>
                            <th scope="row">{book.bookId}</th>
                            <td>
                                {book.title}
                            </td>
                            <td>
                                {book.price}
                            </td>
                            <td>
                                <Link to={`/edit/${book.bookId}`}>
                                    <button className="btn btn-secondary">Edit</button>
                                </Link>
                                <button onClick={() => deleteBook(book.bookId)} className="btn btn-danger">Delete</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <Link to={`/new`}>
                <button className="btn btn-primary">New Book</button>
            </Link>
        </div>
    );
}

