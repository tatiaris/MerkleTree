#lang racket
(define (method meth arg)
  (map meth arg)
  )
(define (square x)
  (* x x)
 )
(define (first s)
  (display (string-split (symbol->string s) " "))
 )

(method square '(1 2 3 4))

(method first '(it is snowing))
;(map (lambda (x) (first '(string-split (symbol->string x) " "))) '(it is snowing))