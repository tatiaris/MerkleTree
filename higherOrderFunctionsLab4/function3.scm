;==================================================================
; File: 3.scm
; Written by: Sunhee Kim and Rishabh Tatia
; Date: 9/18/20
; TAMU email: sunheek@tamu.edu tatiaris@tamu.edu
; Class: CSCE 314 (section 502)
; Description: This is the third program for lab 4
;==================================================================
#lang racket
(define (cube root x)
  (map root x)
 )
(define (root b)
(expt b 1/3)
  )
(cube root '(1 2 3))