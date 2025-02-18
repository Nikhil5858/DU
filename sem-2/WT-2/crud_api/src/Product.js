import React from 'react'
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

function Product() {
    const products = [
          {
            name: "Hoodies",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/mens-better-than-naked-jacket-AVMH_LC9_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            name: "ABC",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/womens-better-than-naked-jacket-AVKL_NN4_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            name: "SINGLE-TRACK",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/womens-single-track-shoe-ALQF_JM3_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            name: "Enduro Boa&reg",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/enduro-boa-hydration-pack-AJQZ_JK3_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            name: "NAKED&trade",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/mens-better-than-naked-jacket-AVMH_LC9_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            name: "NAKED&trade JACKET",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/womens-better-than-naked-jacket-AVKL_NN4_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            name: "SINGLE-TRACK SHOE",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/womens-single-track-shoe-ALQF_JM3_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            name: "Enduro Boa&reg",
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/enduro-boa-hydration-pack-AJQZ_JK3_hero.png",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          },
          {
            img: "http://images.thenorthface.com/is/image/TheNorthFace/236x204_CLR/enduro-boa-hydration-pack-AJQZ_JK3_hero.png",
            name: "Enduro Boa&reg",
            price: "$129.00",
            color: "TNF BLACK",
            size: "S",
          }
      ];
  return (
    <>
        <div className='container'>
          <div className='row'>
          {
            products.map((pro)=>(
              <div className='col-md-4 p-3'>
                <Card style={{ width: '18rem' }}>
                  <Card.Img variant="top" src={pro.img} />
                  <Card.Body>
                      <Card.Title>{pro.name}</Card.Title>
                      <Card.Text>{pro.color}</Card.Text>
                      <Card.Text>{pro.size}</Card.Text>
                      <Button variant="primary">{pro.price}</Button>
                  </Card.Body>
                </Card>
              </div>  
            ))
          }
          </div>
        </div>
    </>
  );
}

export default Product