import React from "react";

function AddItem() {
  return (
    <>
      <form className="addForm">
        <label htmlFor="addItem">Add Item</label>
        <input id="addItem" placeholder="Add Items" required />
        <button type="submit" aria-label="Add Item">Submit</button>
      </form>
    </>
  );
}

export default AddItem;
