package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	details[A <: details[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "details", attributes, content )