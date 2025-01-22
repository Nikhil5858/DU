const express = require('express')

const Router = express.Router();

const {addProducts,getProducts,findProductById,deleteProduct,updateProduct} = require('../controller/productController')

Router.post('/create',addProducts)
Router.get('/find',getProducts)
Router.get('/find/:id',findProductById)
Router.get('/delete/:id',deleteProduct)
Router.post('/update/:id',updateProduct)

module.exports = Router
