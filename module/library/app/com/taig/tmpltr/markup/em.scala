package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	em[A <: em[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "em", attributes, content )