#lang racket

;==================================================================
; File: 3.scm
; Written by: Sunhee Kim and Rishabh Tatia
; Date: 9/18/20
; TAMU email: sunheek@tamu.edu tatiaris@tamu.edu
; Class: CSCE 314 (section 502)
; Description: This is the third program for lab 4
;==================================================================

; load the files
;(load "sort.scm")
;(load "apps.scm")

(define (get_even_numbers list1 list2)
  (cond ((null? list1) list1)
    (not (even? (car list1)) (cons (car list1) list2))

          (else (append  list2 (get_even_numbers (cdr list1) list2) ) )
          
   )
  )
  
  
(get_even_numbers '(1 2 3 4 5 6 7 8 9) '())