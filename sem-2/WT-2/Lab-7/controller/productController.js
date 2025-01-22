const Product = require('../models/product')

const getProducts = async(req,res)=>{
    try {
        const product = await Product.find()
        res.status(200).json(product)
    } catch (error) {
        res.status(400).json({error:err.message})
    }
}

const addProducts = async(req,res)=>{
    const data = req.body
    try {
            const sendProduct = new Product(data)
            const productData = await sendProduct.save()
            res.status(200).json(productData)
        } catch (error) {
        res.status(400).json({error:err.json})
    }
}

const findProductById = async(req,res)=>{
    const {id} = req.params
    try {
        const getProductById = await Product.findById(id)
        res.status(200).json(getProductById)
    } catch (error) {
        res.status(400).json({error:err.message})
    }
}

const deleteProduct = async(req,res)=>{
    const {id} = req.params
    try {
        const deleteProductById = await Product.findByIdAndDelete(id)
        res.status(200).json(deleteProductById)
    } catch (error) {
        res.status(400).json({error:err.message})
    }
}

const updateProduct = async(req,res)=>{
    const {id} = req.params
    const data = req.body
    try {
        const updateProductById = await Product.findByIdAndUpdate(id, data, { new: true })
        res.status(200).json(updateProductById)
    } catch (error) {
        res.status(400).json({error: error.message})
    }
}

module.exports = {addProducts,getProducts,findProductById,deleteProduct,updateProduct}

