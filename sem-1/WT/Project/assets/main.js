(function ($) {
    $('.owl-carousel').owlCarousel({
        items: 3,
        loop: true,
        dots: false,
        nav: true,
        autoplay: true,
        margin: 30,
        responsive: {
            0: { items: 1 },
            600: { items: 2 },
            1200: { items: 3 }
        }
    });
})(jQuery);