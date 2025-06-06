import React from "react";
import { Link } from "react-router-dom";

export default function MyNavbar() {
  return (
    <>
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
        <Link className="navbar-brand text-light me-6" to="/">
          Navbar
        </Link>
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav">
            <li className="nav-item active">
              <Link className="nav-link text-light" to="/">
                Home <span className="sr-only">(current)</span>
              </Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link text-light" to="products">
                Products
              </Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link text-light" to="students">
                Student
              </Link>
            </li>
            <li className="nav-item text-light">
              <Link className="nav-link disabled text-light" href="#">
                Disabled
              </Link>
            </li>
          </ul>
        </div>
      </nav>
    </>
  );
}
