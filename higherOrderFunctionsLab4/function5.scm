#lang racket
(define (indivisible e L)
  (map (remove 1 ((map ((lambda (x y) (modulo y x))) L e))))
  )
(indivisible 3 '(4 5 6 7))