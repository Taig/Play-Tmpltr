package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	label[A <: label[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "label", attributes, content )