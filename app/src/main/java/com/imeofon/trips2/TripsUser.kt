package com.imeofon.trips2

class TripsUser(plane: Int, image: Int, lagos: String, london: String, business: String, date: String, date_two: String) {

    private var plane: Int
    private var image: Int
    private var lagos: String
    private var london: String
    private var business: String
    private var date: String
    private var date_two: String


    init {

        this.plane = plane!!
        this.image = image!!
        this.lagos = lagos!!
        this.london = london!!
        this.business = business!!
        this.date = date!!
        this.date_two = date_two!!

    }

    fun getPlane(): Int? {
        return plane
    }

    fun setPlane(plane: Int?){
        this.plane = plane!!
    }

    fun getImage(): Int?{
        return image
    }

    fun setImage(image: Int?){
        this.image = image!!
    }

    fun getLagos(): String? {
        return lagos
    }

    fun setLagos(name: String?) {
        lagos = name!!
    }

    fun getLondon(): String?{
        return london
    }

    fun setLondon(name: String?) {
        london = name!!
    }

    fun getBusiness(): String? {
        return business
    }

    fun setBusiness(name: String?) {
        business = name!!
    }

    fun getDate(): String? {
        return date
    }

    fun setDate(name: String?) {
        date = name!!
    }

    fun getDate_two(): String? {
        return date_two
    }

    fun setDate_two(name: String?) {
        date_two = name!!
    }

}