#lang racket
; student: Sunhee Kim
; Midterm day 2
; Question 4

(define (cross2 A B)
  
  (cond ((null? A) '())
        ((null? B) '())
        (else (cons (list (car A) (car B))(cross A (cdr B))))
        
  )

 )

(define (cross A B)
  
  (cond ((null? A) '())
        (else
      ; (display "NOT NULL A\n\t")
      
       (append (cross2   (list (car A)) B) (cross   (cdr A) B))
      )
  )
  )


(display (cross '(1 2 3) '(a b)))
(newline)
(display (cross '(hi) '(bye there)))