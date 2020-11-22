#lang racket
; student: Sunhee Kim
; Midterm day 2
; Question 1
(define (remainder x y)
 ;  (display x) (newline) (display y) (newline) (display "IS INTEGER")
 ; (display "( -  (* y (floor (/ x y))) y)\n\t")
 ; (display ( - x (* y (floor (/ x y)))))
  (newline)
  (cond ((integer? (/ x y)) 0)
        ((< x y) x)
        ((> x y) (remainder  ( - x (* y (floor (/ x y)))) y))
    
    )

  )

(display (remainder 50 10))
(newline)

(display (remainder 10 3))
(display (remainder 18 5))

(newline)

