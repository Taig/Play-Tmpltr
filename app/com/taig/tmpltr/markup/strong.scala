package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	strong
extends	Tag.Body[strong, Content]
{
	val tag = "strong"
}