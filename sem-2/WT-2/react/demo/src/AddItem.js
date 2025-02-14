import React from "react";

function AddItem({ newItem, setNewItem, handleSubmit }) {
  return (
    <>
      <form className="addForm" onSubmit={handleSubmit}>
        <label htmlFor="addItem">Add Item</label>
        <input
          id="addItem"
          placeholder="Add Items"
          value={newItem}
          onChange={(e) => setNewItem(e.target.value)}
          required
        />
        <button type="submit" aria-label="Add Item">Submit</button>
      </form>
    </>
  );
}

export default AddItem;
